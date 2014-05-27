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
    Fail23000:
    { 
      TermReference u_4641 = new TermReference();
      IStrategoTerm x_4641 = null;
      IStrategoTerm z_4641 = null;
      IStrategoTerm a_4642 = null;
      if(u_4641.value == null)
        u_4641.value = term;
      else
        if(u_4641.value != term && !u_4641.value.match(term))
          break Fail23000;
      z_4641 = term;
      x_4641 = trans.const4485;
      a_4642 = z_4641;
      term = dr_lookup_rule_0_2.instance.invoke(context, a_4642, x_4641, trans.constCons2047);
      if(term == null)
        break Fail23000;
      lifted6902 lifted69020 = new lifted6902();
      lifted69020.u_4641 = u_4641;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted69020);
      if(term == null)
        break Fail23000;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}