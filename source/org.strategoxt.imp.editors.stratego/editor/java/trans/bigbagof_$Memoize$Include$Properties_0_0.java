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

@SuppressWarnings("all") public class bigbagof_$Memoize$Include$Properties_0_0 extends Strategy 
{ 
  public static bigbagof_$Memoize$Include$Properties_0_0 instance = new bigbagof_$Memoize$Include$Properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_MemoizeIncludeProperties_0_0");
    Fail22226:
    { 
      TermReference a_4330 = new TermReference();
      TermReference b_4330 = new TermReference();
      if(b_4330.value == null)
        b_4330.value = term;
      else
        if(b_4330.value != term && !b_4330.value.match(term))
          break Fail22226;
      if(a_4330.value == null)
        a_4330.value = term;
      else
        if(a_4330.value != term && !a_4330.value.match(term))
          break Fail22226;
      Success11969:
      { 
        Fail22227:
        { 
          IStrategoTerm f_4330 = null;
          f_4330 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, f_4330, trans.const4374, b_4330.value);
          if(term == null)
            break Fail22227;
          if(true)
            break Success11969;
        }
        term = trans.constNil3;
      }
      lifted6808 lifted68080 = new lifted6808();
      lifted68080.a_4330 = a_4330;
      lifted68080.b_4330 = b_4330;
      term = filter_1_0.instance.invoke(context, term, lifted68080);
      if(term == null)
        break Fail22226;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}