# Template Method Pattern

# Note
>
> 又稱：樣板方法模式  
> 
> 好處在於將流程或演算法固定化，而需要新增或擴充皆可以照著定式來做。
>
> 補充說明：  
>   在樣板模式的設計架構中，可以使用 hook method，而不做任何事，或是只做預設的事情，而可以在次類別中被覆寫。  
>
> 好萊塢守則 ( Hollywood principle ):  
> 防止 "依賴腐敗" ，當高階元件依賴低階元件，而低階元件也依賴高階元件，而高階元件又依賴側邊元件，
> 所照成的"依賴腐敗"狀況，使系統難懂如何設計。
>
>

# Reference