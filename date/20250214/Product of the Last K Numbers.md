# 1352. [Product of the Last K Numbers](https://leetcode.com/problems/product-of-the-last-k-numbers/description/?envType=daily-question&envId=2025-02-14)

## Solution

```java
class ProductOfNumbers {
    private List<Integer> products;

    public ProductOfNumbers() {
        products = new ArrayList<>();
    }

    public void add(int num) {
        if (num == 0) {
            products.clear();
        } else {
            products.add(num * (products.isEmpty() ? 1 : products.get(products.size() - 1)));
        }
    }

    public int getProduct(int k) {
        int n = products.size();
        if (n == 0 || k > n) return 0;
        if (k == n) return products.get(n - 1);
        return products.get(n - 1) / products.get(n - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
```


![image](https://github.com/user-attachments/assets/eb6ad93a-eea3-4a32-b266-610e5009ae3f)
