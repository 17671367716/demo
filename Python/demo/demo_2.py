  # creation time:2021/7/14 10:23
  # theme: range

arr1 = range(100)
print(list(arr1))

arr1 = range(100,5)
print(list(arr1))

arr1 = range(5,10,2)
print(list(arr1))

arr1 = range(0,100,5)
print(list(arr1))

arr1 = range(10,100,5)
print(list(arr1))

a = 0;
count = 0;
while a<=100:
    if(a%2 == 0):
        count += a
    a += 1
print(count)

a = 0;
count = 0;
while a<=100:
    if not bool(a%2):
        count += a
    a += 1
print(count)

ran = range(0,100,5)
for item in ran:
    print()
