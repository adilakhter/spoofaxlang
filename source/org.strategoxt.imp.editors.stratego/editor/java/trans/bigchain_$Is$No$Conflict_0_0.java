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

@SuppressWarnings("all") public class bigchain_$Is$No$Conflict_0_0 extends Strategy 
{ 
  public static bigchain_$Is$No$Conflict_0_0 instance = new bigchain_$Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsNoConflict_0_0");
    Fail23777:
    { 
      IStrategoTerm y_4895 = null;
      IStrategoTerm b_4896 = null;
      IStrategoTerm d_4896 = null;
      y_4895 = term;
      d_4896 = term;
      Success12697:
      { 
        Fail23778:
        { 
          IStrategoTerm f_4896 = null;
          f_4896 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, f_4896, trans.const4637, y_4895);
          if(term == null)
            break Fail23778;
          if(true)
            break Success12697;
        }
        term = trans.constNil4;
      }
      b_4896 = term;
      term = d_4896;
      term = termFactory.makeTuple(b_4896, term);
      term = foldl_1_0.instance.invoke(context, term, lifted7105.instance);
      if(term == null)
        break Fail23777;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}