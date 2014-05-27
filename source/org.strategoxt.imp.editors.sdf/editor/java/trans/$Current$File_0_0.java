package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
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
    Fail76136:
    { 
      TermReference r_92080 = new TermReference();
      IStrategoTerm u_92080 = null;
      IStrategoTerm w_92080 = null;
      IStrategoTerm x_92080 = null;
      if(r_92080.value == null)
        r_92080.value = term;
      else
        if(r_92080.value != term && !r_92080.value.match(term))
          break Fail76136;
      w_92080 = term;
      u_92080 = trans.const15448;
      x_92080 = w_92080;
      term = dr_lookup_rule_0_2.instance.invoke(context, x_92080, u_92080, trans.constCons7205);
      if(term == null)
        break Fail76136;
      lifted21595 lifted215950 = new lifted21595();
      lifted215950.r_92080 = r_92080;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted215950);
      if(term == null)
        break Fail76136;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}