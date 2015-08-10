// This is a generated file. Not intended for manual editing.
package ee.edio.garmin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ee.edio.garmin.psi.MonkeyCTypes.*;
import ee.edio.garmin.psi.*;

public class MonkeyCIdentifierSuffixImpl extends MonkeyCPsiCompositeElementImpl implements MonkeyCIdentifierSuffix {

  public MonkeyCIdentifierSuffixImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MonkeyCVisitor) ((MonkeyCVisitor)visitor).visitIdentifierSuffix(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MonkeyCArguments getArguments() {
    return findChildByClass(MonkeyCArguments.class);
  }

  @Override
  @NotNull
  public List<MonkeyCExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MonkeyCExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
