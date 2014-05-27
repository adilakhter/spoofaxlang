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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsNoConflict_1_0");
    Fail22297:
    { 
      IStrategoTerm i_4341 = null;
      IStrategoTerm m_4341 = null;
      IStrategoTerm o_4341 = null;
      i_4341 = term;
      o_4341 = term;
      Success11986:
      { 
        Fail22298:
        { 
          IStrategoTerm q_4341 = null;
          q_4341 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, q_4341, trans.const4427, i_4341);
          if(term == null)
            break Fail22298;
          if(true)
            break Success11986;
        }
        term = trans.constNil3;
      }
      m_4341 = term;
      term = o_4341;
      term = termFactory.makeTuple(m_4341, term);
      term = l_4341.invoke(context, term, lifted6832.instance);
      if(term == null)
        break Fail22297;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}