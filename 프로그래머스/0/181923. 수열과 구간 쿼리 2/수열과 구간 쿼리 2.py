def solution(arr, queries):
    answer = []
    
    for s, e, k in queries:
        temp = max(arr)+1
        for i in arr[s:e+1] :
            if i > k and temp > i:
                temp = i
                
        if temp == max(arr)+1:
            answer.append(-1)
        else :
            answer.append(temp)  
    return answer