# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.boldtextview.BoldTextView {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/boldtextview/repack'
-flattenpackagehierarchy
-dontpreverify
