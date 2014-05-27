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

@SuppressWarnings("all") public class bigfold_$Is$No$Conflict_1_0 extends Strategy 
{ 
  public static bigfold_$Is$No$Conflict_1_0 instance = new bigfold_$Is$No$Conflict_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4895)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsNoConflict_1_0");
    Fail23773:
    { 
      IStrategoTerm a_4895 = null;
      IStrategoTerm e_4895 = null;
      IStrategoTerm g_4895 = null;
      a_4895 = term;
      g_4895 = term;
      Success12695:
      { 
        Fail23774:
        { 
          IStrategoTerm i_4895 = null;
          i_4895 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, i_4895, trans.const4637, a_4895);
          if(term == null)
            break Fail23774;
          if(true)
            break Success12695;
        }
        term = trans.constNil4;
      }
      e_4895 = term;
      term = g_4895;
      term = termFactory.makeTuple(e_4895, term);
      term = d_4895.invoke(context, term, lifted7103.instance);
      if(term == null)
        break Fail23773;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}