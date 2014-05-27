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

@SuppressWarnings("all") public class bigchain_$Current$Dir_0_0 extends Strategy 
{ 
  public static bigchain_$Current$Dir_0_0 instance = new bigchain_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_CurrentDir_0_0");
    Fail23570:
    { 
      IStrategoTerm r_4861 = null;
      IStrategoTerm t_4861 = null;
      t_4861 = term;
      Success12624:
      { 
        Fail23571:
        { 
          IStrategoTerm u_4861 = null;
          IStrategoTerm w_4861 = null;
          IStrategoTerm x_4861 = null;
          w_4861 = term;
          u_4861 = trans.const4556;
          x_4861 = w_4861;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, x_4861, u_4861, trans.constCons2047);
          if(term == null)
            break Fail23571;
          if(true)
            break Success12624;
        }
        term = trans.constNil4;
      }
      r_4861 = term;
      term = t_4861;
      term = termFactory.makeTuple(r_4861, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7032.instance);
      if(term == null)
        break Fail23570;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}