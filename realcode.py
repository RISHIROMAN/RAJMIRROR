print("please choice the way you want to search the details of element:")      # Menu 
print("(1) by name ")
print("(2) by atomic number")
choice=int(input("enter your choice as 1,2 only:"))

# Function defination 

def file_open_split(file_name):
     file_object=open(file_name,"r")
     variable1=file_object.read()
     variable2=variable1.split("/")
     file_object.close()
     return variable2

def change1(list):
    return [[el]for el in list ] 

def change2(list):
    res=[]
    for el in list:
        for mm in el:
            sub=mm.split("\t")
            res.append(sub)
    return res     

# Function Call
variable1=file_open_split("periodic_table_details.txt")
variable2=change1(variable1)
variable3=change2(variable2)  


if choice==1:
    elementname=str(input("enter the name of element: "))
    variable4 =elementname.capitalize()
    for i in range(1,len(variable3)+1):
         if i<=len(variable3)-1 and variable3[i][3]==variable4 :
                 print("Details of the Element is ==>")
                 print("Atomic Number :",i) 
                 print("Atomic Weight :" , variable3[i][2] )
                 print("Name :" , variable3[i][3])
                 print("Symbol :",variable3[i][4])
                 print("Melting Point (In Celsius) :", variable3[i][5] )
                 print("Boiling Point (In Celsius) :",variable3[i][6])
                 print("Density (g/cm ^3) :",variable3[i][7])
                 print("Percentage Present In Earth :",variable3[i][8] )
                 print("Group :",variable3[i][9]) 
                 print("Electronic Configuration :",variable3[i][10])
                 break  
         elif i<=len(variable3)-1 and variable3[i][3]!=variable4 :
             continue       

         else:
             i==len(variable3)
             print("Invalid name of element . ")
             break

if choice==2:
     elementno=int(input("enter the atomic number (not greater then 109): "))
     if elementno>109:
         print("element with atomic numer",elementno,"is not yet discovered properly that is its properties are not known clearly")
     else:
        print("Details of the Element is ==>")
        print("Atomic Number :",elementno) 
        print("Atomic Weight :" , variable3[elementno][2] )
        print("Name :" , variable3[elementno][3])
        print("Symbol :",variable3[elementno][4])
        print("Melting Point (In Celsius) :", variable3[elementno][5] )
        print("Boiling Point (In Celsius) :",variable3[elementno][6])
        print("Density (g/cm ^3) :",variable3[elementno][7])
        print("Percentage Present In Earth :",variable3[elementno][8] )
        print("Group :",variable3[elementno][9]) 
        print("Electronic Configuration :",variable3[elementno][10])

# End of Code
                 
         