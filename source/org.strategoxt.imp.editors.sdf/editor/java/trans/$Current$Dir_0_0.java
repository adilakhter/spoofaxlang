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

@SuppressWarnings("all") public class $Current$Dir_0_0 extends Strategy 
{ 
  public static $Current$Dir_0_0 instance = new $Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("CurrentDir_0_0");
    Fail76214:
    { 
      TermReference i_92093 = new TermReference();
      IStrategoTerm l_92093 = null;
      IStrategoTerm n_92093 = null;
      IStrategoTerm o_92093 = null;
      if(i_92093.value == null)
        i_92093.value = term;
      else
        if(i_92093.value != term && !i_92093.value.match(term))
          break Fail76214;
      n_92093 = term;
      l_92093 = trans.const15515;
      o_92093 = n_92093;
      term = dr_lookup_rule_0_2.instance.invoke(context, o_92093, l_92093, trans.constCons7205);
      if(term == null)
        break Fail76214;
      lifted21622 lifted216220 = new lifted21622();
      lifted216220.i_92093 = i_92093;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted216220);
      if(term == null)
        break Fail76214;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}