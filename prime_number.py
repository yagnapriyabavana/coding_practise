def is_prime(n):
    count=0
    for i in range(1,n+1):
        if n%i==0:
            count+=1
    if count==2:
        print("The number is prime:",n)
    else:
        print("Not a Prime:",n)
n=int(input("enter a number:"))
is_prime(n)
