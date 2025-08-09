# Last updated: 8/9/2025, 1:40:46 PM
class Solution(object):
    def luckyNumbers (self, matrix):
        
      
        n=len(matrix)
        m=len(matrix[0])

        rowMin = []
        for i in range(n):
            rMin = float('inf')
            for j in range(m):
                rMin = min(rMin, matrix[i][j])
            rowMin.append(rMin)

        colMax = []
        for i in range(m):
            cMax = float('-inf')
            for j in range(n):
                cMax = max(cMax, matrix[j][i])
            colMax.append(cMax)

        lucky=[]
        for i in range(n):
            for j in range(m):
                if matrix[i][j] == rowMin[i] and matrix[i][j] == colMax[j]:
                    lucky.append(matrix[i][j])

        return lucky