#   creation time:2021/7/16 10:32
#   theme:  格式化字符串

name = 'zhangsan'
age = 18
grade = 98.5
print('我的名字叫 %s , 我的年龄是 %d 岁, 考试成绩为 %f' % (name,age,grade))
print('我的名字叫 %s , 我的年龄是 %d 岁, 考试成绩为 %1.2f' % (name,age,grade))
print('我的名字叫 {} , 我的年龄是 {} 岁, 考试成绩为 {} '.format (name,age,grade))
print('我的名字叫 {} , 我的年龄是 {} 岁, 考试成绩为 {:10.3f} '.format (name,age,grade))
print(f'我的名字叫 {name} , 我的年龄是 {age} 岁, 考试成绩为 {grade}')
