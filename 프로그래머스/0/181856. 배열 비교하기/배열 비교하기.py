def solution(arr1, arr2):
    answer = 2
    
    if len(arr1) < len(arr2) : 
        answer=-1
    elif len(arr1) > len(arr2) : 
        answer=1
    else :
        sum_arr1 = 0;
        sum_arr2 = 0;
        
        for x in arr1:
            sum_arr1 += x;
        
        
        for x in arr2:
            sum_arr2 += x;
            
        if sum_arr1 < sum_arr2 :
            answer = -1
        elif sum_arr1 > sum_arr2 :
            answer = 1
        else :
            answer = 0
        
    
    return answer