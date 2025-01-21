def solution(code):
    answer = ''
    mode = 0
    
    for idx in range(len(code)):
        
        if code[idx]=='1' :
            mode = 1-mode
        
        else :
            answer = answer+code[idx] if mode == idx%2 else answer
        
    return answer if answer!='' else 'EMPTY'
