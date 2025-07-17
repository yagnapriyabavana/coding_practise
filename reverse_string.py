def reverse_string(s,n):
    j=n 
    while(j>=0):
        print(s[j-1],end="")
        j-=1 
s=input()
n=len(s)
reverse_string(s,n)
