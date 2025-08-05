def even_odd(l,n):
    count_even=0
    count_odd=0
    for i in range(n):
        if l[i]%2==0:
            count_even+=1 
        else:
            count_odd+=1
    print("The List is:",l)
    print("Even number count:",count_even)
    print("Odd number count:",count_odd)
n=int(input("enter the number of elements int he list:"))
arr=[]
for i in range(n):
    arr.append(int(input("enter list elements:")))
even_odd(arr,n)
