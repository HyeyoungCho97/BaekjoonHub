def solution(myString):
    answer = []
    num = 0
    
    for str in myString :
        if str!='x' :
            num += 1
        else :
            answer.append(num)
            num = 0
            
    answer.append(num)
    
        
        
    return answer