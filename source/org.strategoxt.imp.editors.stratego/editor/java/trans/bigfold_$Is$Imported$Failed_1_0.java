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

@SuppressWarnings("all") public class bigfold_$Is$Imported$Failed_1_0 extends Strategy 
{ 
  public static bigfold_$Is$Imported$Failed_1_0 instance = new bigfold_$Is$Imported$Failed_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4324)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsImportedFailed_1_0");
    Fail22192:
    { 
      IStrategoTerm e_4324 = null;
      IStrategoTerm i_4324 = null;
      IStrategoTerm k_4324 = null;
      e_4324 = term;
      k_4324 = term;
      Success11958:
      { 
        Fail22193:
        { 
          IStrategoTerm m_4324 = null;
          m_4324 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, m_4324, trans.const4366, e_4324);
          if(term == null)
            break Fail22193;
          if(true)
            break Success11958;
        }
        term = trans.constNil3;
      }
      i_4324 = term;
      term = k_4324;
      term = termFactory.makeTuple(i_4324, term);
      term = h_4324.invoke(context, term, lifted6795.instance);
      if(term == null)
        break Fail22192;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}