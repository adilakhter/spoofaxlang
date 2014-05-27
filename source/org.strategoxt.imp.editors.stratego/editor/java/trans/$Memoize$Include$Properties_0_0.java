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

@SuppressWarnings("all") public class $Memoize$Include$Properties_0_0 extends Strategy 
{ 
  public static $Memoize$Include$Properties_0_0 instance = new $Memoize$Include$Properties_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("MemoizeIncludeProperties_0_0");
    Fail22233:
    { 
      TermReference d_4331 = new TermReference();
      TermReference e_4331 = new TermReference();
      IStrategoTerm i_4331 = null;
      if(e_4331.value == null)
        e_4331.value = term;
      else
        if(e_4331.value != term && !e_4331.value.match(term))
          break Fail22233;
      if(d_4331.value == null)
        d_4331.value = term;
      else
        if(d_4331.value != term && !d_4331.value.match(term))
          break Fail22233;
      i_4331 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, i_4331, trans.const4374, e_4331.value);
      if(term == null)
        break Fail22233;
      lifted6812 lifted68120 = new lifted6812();
      lifted68120.d_4331 = d_4331;
      lifted68120.e_4331 = e_4331;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted68120);
      if(term == null)
        break Fail22233;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}