num= 0
def logintry():
    username=input("enter the user:")
    password=input("enter the password:")
    login(username,password)
def login(uid,pid):
    global num 
    if (uid =="rishiraj" and pid=="rajrover"):
            print("enter succesfuly")
            return
    else:
        num+=1
        print("the username and password you enterted is incorrect")
    if( num> 2):
        print("you have crossed the maximum number of triess")
        print("f**k off")
        print("account blocked")
        return    
    else:
         print("retry")
         logintry() 
logintry()        


