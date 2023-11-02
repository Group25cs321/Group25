#I received no assistance on this assignment that violates the ethical guidelines set forth by professor and class syllabus
print("Welcome to the Sims4 Builder Helper!")
#sim lot
#taking values and converting to integers
width = float(input("What is the width of your lot in Sim units?"))
length = float(input(" What is the length of your lot in Sim units?"))
#specific item, width, and length 
spec_item = input(" What is your specific item?")
# using float so user can put in speicifc valyes ie: 1.75 in the example
ws_item = float(input(" What is the width of your specific item in Sim units?"))
ls_item = float(input(" What is the length of your specific item in Sim units?"))
#area in sims units 
lot_area = (width * length)
#display to user 
print(" The area of your lot in Sim units is" , int(lot_area) , "square units")
#area in square feet, multipy sim unit area by 4x4 dimensions
base_width = width * 4
base_length = length * 4
square_feetarea = int(base_width * base_length)
#display to user 
print("The area of your lot in square feet is " + str(square_feetarea) + " square ft")
#area of specific item in feet by feet
ws_area = int(ws_item * 4)
ls_area = int(ls_item * 4)
specitem_area = (ws_item * ls_item)
#display to user 
print("The " + str(spec_item) + " in the real world is about " + str(ws_area) + " ft by " + str(ls_area) + " ft")
# calculating how many of the item will fit in the lot
# seperatley figuring out how much of the width and the length of the item will fit in the lot 
wt = int((width/ws_item))
lt = int((length/ls_item))
# finding the total of the speicifc item 
total_item = int(wt * lt)
print("About " + str(total_item) +" "+spec_item + "s can fit in this lot")
tisf = float(total_item * specitem_area)
# calculating percentage of lot covered
# using float to get the decimal value first and then converting to percentage 
final = float(tisf/lot_area)
# calculating integer percentage 
tfinal= int(final * 100)
print("About " + str(tfinal) + "% of the lot is covered by the " + str(spec_item) + "s")
#caluclating percentage of lot unused by subtracting the number used from total lot
unused = int(ws_item * ls_item)
iarea= int(unused * total_item)
totalunused = (lot_area - iarea)
print("About " + str(unused) + " square units is left uncovered")
#calculating units and percentage of unused space 
unused_final = float(lot_area - iarea)
uncovered = (unused_final / square_feetarea)
ufinal = int(uncovered * 100)
print("About " + str(ufinal) + "% of the lot is left uncovered")
print("Have fun building!")
