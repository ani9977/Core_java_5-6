list1 = [1, 2, 3, 4, 5, 6]
list2 = [1, 2, 3, 4, 5]
a = len(list1)
for i in range (0,a-1):
    for j in range(0,a):
        if(list2[i]==list1[j]):
            list1.remove(list1[j])
        else:
            