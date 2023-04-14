def nextgreatesttoLeft(arr):
  res = []
  for i in range(0, len(arr)):
    for j in range(i-1, -1, -1):
      if arr[i] < arr[j]:
        result.append(arr[j])
        break
    else:
      res.append(-1)

  return result

arr = [2,3,5,6,1,5,7]
print(NextGreatertLeft(arr))