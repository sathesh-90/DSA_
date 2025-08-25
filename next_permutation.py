class Solution:
    def nextPermutation(self, arr):
        # code here
        ind = -1
        n = len(arr)
        for i in range(n-2,-1,-1):
            if arr[i]<arr[i+1] :
                ind = i
                break
            
        if ind==-1:
            arr.reverse()
            return arr
        
        for i in range(n-1,ind,-1):
            if arr[i]>arr[ind] :
                arr[i],arr[ind]=arr[ind],arr[i]
                break
            
        l,r=ind+1,n-1
        while l<r:
            arr[l],arr[r]=arr[r],arr[l]
            l=l+1
            r=r-1
        return arr    
