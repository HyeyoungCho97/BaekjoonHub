def solution(numLog):
    answer = ''
    
    for idx in range(len(numLog)-1) :
        
        diff = numLog[idx+1] - numLog[idx]
        
        if diff == 1 :
            answer += "w"
        elif diff == -1 :
            answer += "s"
        elif diff == 10:
            answer += "d"
        elif diff == -10 :
            answer += "a"
        else :
            answer += "e"
        
    return answer