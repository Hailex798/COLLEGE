def NextSmallerRight(arr):
    res = []
    for i in range(0, len(arr)):
        for j in range(i+1, len(arr)):
            if arr[i] > arr[j]:
                res.append(arr[j])
                break
        else:
          result.append(-1)

    return result

arr = [1,3,4,7,9]
print(NextSmallerRight(arr))