list = {'name':"anant", 'age':19}
k=input("Enter key to search:")
d=list.keys()
try:
    v=list[k]
    print("key is present")
except Exception:
    print("key not found")
