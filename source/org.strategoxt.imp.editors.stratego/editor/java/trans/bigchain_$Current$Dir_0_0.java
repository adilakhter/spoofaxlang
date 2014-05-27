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
    Fail22094:
    { 
      IStrategoTerm z_4307 = null;
      IStrategoTerm b_4308 = null;
      b_4308 = term;
      Success11915:
      { 
        Fail22095:
        { 
          IStrategoTerm c_4308 = null;
          IStrategoTerm e_4308 = null;
          IStrategoTerm f_4308 = null;
          e_4308 = term;
          c_4308 = trans.const4346;
          f_4308 = e_4308;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, f_4308, c_4308, trans.constCons1966);
          if(term == null)
            break Fail22095;
          if(true)
            break Success11915;
        }
        term = trans.constNil3;
      }
      z_4307 = term;
      term = b_4308;
      term = termFactory.makeTuple(z_4307, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6761.instance);
      if(term == null)
        break Fail22094;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}