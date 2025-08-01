rows=int(input("Enter the number of rows"))
num=1
for i in range(1,rows+1):
    for j in range(rows-i):
        print(" ",end="")
    for k in range(i):
        print(num,end=" ")
        num+=1
    print()