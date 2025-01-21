def solution(code):
    answer = ''
    mode = 0
    
    for idx in range(0, len(code)):
        
        if code[idx]=='1' :
            mode = (mode+1)%2
            continue
            
        answer = mode0(idx, code[idx], answer) if mode==0 else mode1(idx, code[idx], answer)

    return answer if answer!='' else 'EMPTY'

def mode0(idx, value, answer):
    return answer+value if value!=1 and idx%2==0 else answer

def mode1(idx, value, answer):
    return answer+value if value!=1 and idx%2==1 else answer
