def solution(a, d, included):
    
    answer = a if included[0] else 0
    num = a
    
    for x in included[1:]:
        num = num+d
        answer = answer+num if x else answer
        
    return answer