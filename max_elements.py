def maxx_array(arr):
    n=len(arr)
    maxx=arr[i]
    for j in range(n):
        if arr[j]>maxx:
            maxx=arr[j]
    return maxx
n=int(input())
arr=[]
for i in range(n):
    arr.append(int(input()))
print("max array:",maxx_array(arr))
