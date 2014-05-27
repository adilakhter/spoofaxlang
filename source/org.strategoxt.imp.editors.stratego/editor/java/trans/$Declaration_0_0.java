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

@SuppressWarnings("all") public class $Declaration_0_0 extends Strategy 
{ 
  public static $Declaration_0_0 instance = new $Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("Declaration_0_0");
    Fail22131:
    { 
      TermReference d_4314 = new TermReference();
      TermReference e_4314 = new TermReference();
      IStrategoTerm i_4314 = null;
      if(e_4314.value == null)
        e_4314.value = term;
      else
        if(e_4314.value != term && !e_4314.value.match(term))
          break Fail22131;
      if(d_4314.value == null)
        d_4314.value = term;
      else
        if(d_4314.value != term && !d_4314.value.match(term))
          break Fail22131;
      i_4314 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, i_4314, trans.const4360, e_4314.value);
      if(term == null)
        break Fail22131;
      lifted6776 lifted67760 = new lifted6776();
      lifted67760.d_4314 = d_4314;
      lifted67760.e_4314 = e_4314;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted67760);
      if(term == null)
        break Fail22131;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}