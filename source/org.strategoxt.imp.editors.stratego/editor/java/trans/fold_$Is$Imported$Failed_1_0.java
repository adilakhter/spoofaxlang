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

@SuppressWarnings("all") public class fold_$Is$Imported$Failed_1_0 extends Strategy 
{ 
  public static fold_$Is$Imported$Failed_1_0 instance = new fold_$Is$Imported$Failed_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4878)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsImportedFailed_1_0");
    Fail23670:
    { 
      IStrategoTerm i_4878 = null;
      IStrategoTerm m_4878 = null;
      IStrategoTerm o_4878 = null;
      i_4878 = term;
      o_4878 = term;
      Success12668:
      { 
        Fail23671:
        { 
          IStrategoTerm q_4878 = null;
          q_4878 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, q_4878, trans.const4576, i_4878);
          if(term == null)
            break Fail23671;
          if(true)
            break Success12668;
        }
        term = trans.constNil4;
      }
      m_4878 = term;
      term = o_4878;
      term = termFactory.makeTuple(m_4878, term);
      term = l_4878.invoke(context, term, lifted7067.instance);
      if(term == null)
        break Fail23670;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}