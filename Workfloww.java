class WorkflowNode {
    String processingStep;
    int businessObjectId;
    String status;
    WorkflowNode next;

    public WorkflowNode(String processingStep, int businessObjectId) {
        this.processingStep = processingStep;
        this.businessObjectId = businessObjectId;
        this.status = "In Progress";
        this.next = null;
    }
}

class WorkflowTable {
    private WorkflowNode head;

    public WorkflowTable() {
        this.head = null;
    }

    public void addToWorkflow(String processingStep, int businessObjectId) {
        WorkflowNode newNode = new WorkflowNode(processingStep, businessObjectId);
        if (head == null) {
            head = newNode;
        } else {
            WorkflowNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public WorkflowNode getNextWorkItem() {
        if (head != null) {
            WorkflowNode nextWorkItem = head;
            head = head.next;
            return nextWorkItem;
        }
        return null;
    }
}

public class WorkflowExample {
    public static void main(String[] args) {
        WorkflowTable workflowTable = new WorkflowTable();

        // Data Entry
        workflowTable.addToWorkflow("Data Entry", 1);

        // Review
        workflowTable.addToWorkflow("Review", 1);

        // Approve
        workflowTable.addToWorkflow("Approve", 1);

        // Simulate processing steps
        simulateProcessing(workflowTable);
        simulateProcessing(workflowTable);
        simulateProcessing(workflowTable);
        simulateProcessing(workflowTable);
    }

    private static void simulateProcessing(WorkflowTable workflowTable) {
        WorkflowNode workItem = workflowTable.getNextWorkItem();
        if (workItem != null) {
            System.out.println("Processing Step: " + workItem.processingStep +
                    ", Business Object ID: " + workItem.businessObjectId +
                    ", Status: " + workItem.status);

            // Simulate completing the processing step
            workItem.status = "Completed";

            // Check if the workflow item needs to move to the Approver
            if (workItem.processingStep.equals("Review")) {
                System.out.println("Moving to Approver...");
                // Add the same item to the workflow for the Approver
                workflowTable.addToWorkflow("Approve", workItem.businessObjectId);
            }
        } else {
            System.out.println("No more work items");
        }

        System.out.println();  // Add a newline for clarity
    }
