# 1233. [Remove Sub-Folders from the Filesystem](https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/?envType=daily-question&envId=2024-10-25)

## Solution

```java
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        
        for (int i = 1; i < folder.length; i++) {
            String lastFolder = ans.get(ans.size() - 1) + "/";
            
            if (!folder[i].startsWith(lastFolder)) {
                ans.add(folder[i]);
            }
        }
        
        return ans;
    }
}
```
