#   creation time:2021/7/15 10:31
#   theme:  字典生成器

#   当两个列表长度不相同时，取短的

itmes = ['a','b','c','d']
prices = [1,2,3]

d1 = {item:price for item,price in zip(itmes,prices)}
d2 = {item.upper():price for item,price in zip(itmes,prices)}
print(d1,d2)
