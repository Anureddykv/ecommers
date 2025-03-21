
@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0003H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001aM\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a>\u0010\u0015\u001a\u00020\u00012\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u00170\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d0\u001cH\u0007\u001a\u001a\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007\u001a@\u0010!\u001a\u00020\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010&2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00010&H\u0007\u001a\b\u0010(\u001a\u00020\u0001H\u0007\u001a\u0010\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\bH\u0007\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"CategorySection", "", "categories", "", "Lkotlin/Pair;", "", "CountdownTimer", "targetTime", "", "DotsIndicator", "totalDots", "", "selectedIndex", "modifier", "Landroidx/compose/ui/Modifier;", "dotSize", "Landroidx/compose/ui/unit/Dp;", "selectedDotSize", "dotSpacing", "DotsIndicator-K3kv9t0", "(IILandroidx/compose/ui/Modifier;FFF)V", "FlashSaleSection", "productList", "", "", "navController", "Landroidx/navigation/NavHostController;", "favorites", "Landroidx/compose/runtime/MutableState;", "", "HomeScreen", "viewModel", "Lcom/fincare/ecommerceapp/presentation/viewmodel/HomeViewModel;", "ProductCard", "product", "isFavorite", "", "onFavoriteClick", "Lkotlin/Function0;", "onClick", "PromotionalBanner", "TimeBox", "value", "app_debug"})
public final class HomeScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    com.fincare.ecommerceapp.presentation.viewmodel.HomeViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void PromotionalBanner() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CategorySection(@org.jetbrains.annotations.NotNull
    java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> categories) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FlashSaleSection(@org.jetbrains.annotations.NotNull
    java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> productList, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.util.Set<java.lang.Integer>> favorites) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ProductCard(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.lang.Object> product, boolean isFavorite, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFavoriteClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CountdownTimer(long targetTime) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TimeBox(long value) {
    }
}