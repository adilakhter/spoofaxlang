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

@SuppressWarnings("all") public class $Project$Dir_0_0 extends Strategy 
{ 
  public static $Project$Dir_0_0 instance = new $Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ProjectDir_0_0");
    Fail23399:
    { 
      TermReference z_4832 = new TermReference();
      IStrategoTerm c_4833 = null;
      IStrategoTerm e_4833 = null;
      IStrategoTerm f_4833 = null;
      if(z_4832.value == null)
        z_4832.value = term;
      else
        if(z_4832.value != term && !z_4832.value.match(term))
          break Fail23399;
      e_4833 = term;
      c_4833 = trans.const4475;
      f_4833 = e_4833;
      term = dr_lookup_rule_0_2.instance.invoke(context, f_4833, c_4833, trans.constCons2047);
      if(term == null)
        break Fail23399;
      lifted6975 lifted69750 = new lifted6975();
      lifted69750.z_4832 = z_4832;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted69750);
      if(term == null)
        break Fail23399;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}