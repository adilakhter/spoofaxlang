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

@SuppressWarnings("all") public class $Current$File_0_0 extends Strategy 
{ 
  public static $Current$File_0_0 instance = new $Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("CurrentFile_0_0");
    Fail21949:
    { 
      TermReference o_4283 = new TermReference();
      IStrategoTerm r_4283 = null;
      IStrategoTerm t_4283 = null;
      IStrategoTerm u_4283 = null;
      if(o_4283.value == null)
        o_4283.value = term;
      else
        if(o_4283.value != term && !o_4283.value.match(term))
          break Fail21949;
      t_4283 = term;
      r_4283 = trans.const4263;
      u_4283 = t_4283;
      term = dr_lookup_rule_0_2.instance.invoke(context, u_4283, r_4283, trans.constCons1966);
      if(term == null)
        break Fail21949;
      lifted6713 lifted67130 = new lifted6713();
      lifted67130.o_4283 = o_4283;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted67130);
      if(term == null)
        break Fail21949;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}