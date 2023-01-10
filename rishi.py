def Search():


    L=eval(input("Enter 10 Numbers. "))
    N=int(input("Enter number to be searched.  "))
    for i in L:
        if i == N:
            return True     #ddddd#ddddd#dddd  #dddd
        
    return False




if Search():
    print("Number Found.")
else:
    print("Number NOT Found.")