package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bagof_$Memoize$Include$Properties_0_0 extends Strategy 
{ 
  public static bagof_$Memoize$Include$Properties_0_0 instance = new bagof_$Memoize$Include$Properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_MemoizeIncludeProperties_0_0");
    Fail22231:
    { 
      TermReference x_4330 = new TermReference();
      TermReference y_4330 = new TermReference();
      if(y_4330.value == null)
        y_4330.value = term;
      else
        if(y_4330.value != term && !y_4330.value.match(term))
          break Fail22231;
      if(x_4330.value == null)
        x_4330.value = term;
      else
        if(x_4330.value != term && !x_4330.value.match(term))
          break Fail22231;
      Success11971:
      { 
        Fail22232:
        { 
          IStrategoTerm c_4331 = null;
          c_4331 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4331, trans.const4374, y_4330.value);
          if(term == null)
            break Fail22232;
          if(true)
            break Success11971;
        }
        term = trans.constNil3;
      }
      lifted6811 lifted68110 = new lifted6811();
      lifted68110.x_4330 = x_4330;
      lifted68110.y_4330 = y_4330;
      term = filter_1_0.instance.invoke(context, term, lifted68110);
      if(term == null)
        break Fail22231;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}