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

@SuppressWarnings("all") public class $Source$Dir_0_0 extends Strategy 
{ 
  public static $Source$Dir_0_0 instance = new $Source$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("SourceDir_0_0");
    Fail22001:
    { 
      TermReference y_4291 = new TermReference();
      IStrategoTerm b_4292 = null;
      IStrategoTerm d_4292 = null;
      IStrategoTerm e_4292 = null;
      if(y_4291.value == null)
        y_4291.value = term;
      else
        if(y_4291.value != term && !y_4291.value.match(term))
          break Fail22001;
      d_4292 = term;
      b_4292 = trans.const4342;
      e_4292 = d_4292;
      term = dr_lookup_rule_0_2.instance.invoke(context, e_4292, b_4292, trans.constCons1966);
      if(term == null)
        break Fail22001;
      lifted6731 lifted67310 = new lifted6731();
      lifted67310.y_4291 = y_4291;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted67310);
      if(term == null)
        break Fail22001;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}