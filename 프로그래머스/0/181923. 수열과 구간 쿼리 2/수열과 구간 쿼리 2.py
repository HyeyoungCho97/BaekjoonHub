def solution(arr, queries):
    answer = []
    
    for s, e, k in queries:
        temp = [i for i in arr[s:e+1] if i > k]
        answer.append( -1 if len(temp)==0 else min(temp) )

    return answer