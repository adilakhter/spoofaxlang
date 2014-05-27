package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Current$File_0_0 extends Strategy 
{ 
  public static $Current$File_0_0 instance = new $Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("CurrentFile_0_0");
    Fail87808:
    { 
      TermReference r_17585 = new TermReference();
      IStrategoTerm u_17585 = null;
      IStrategoTerm w_17585 = null;
      IStrategoTerm x_17585 = null;
      if(r_17585.value == null)
        r_17585.value = term;
      else
        if(r_17585.value != term && !r_17585.value.match(term))
          break Fail87808;
      w_17585 = term;
      u_17585 = trans.const17872;
      x_17585 = w_17585;
      term = dr_lookup_rule_0_2.instance.invoke(context, x_17585, u_17585, trans.constCons8528);
      if(term == null)
        break Fail87808;
      lifted24787 lifted247870 = new lifted24787();
      lifted247870.r_17585 = r_17585;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted247870);
      if(term == null)
        break Fail87808;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}