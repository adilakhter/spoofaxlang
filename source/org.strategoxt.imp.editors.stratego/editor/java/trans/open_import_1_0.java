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

@SuppressWarnings("all") public class open_import_1_0 extends Strategy 
{ 
  public static open_import_1_0 instance = new open_import_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4782)
  { 
    context.push("open_import_1_0");
    Fail23100:
    { 
      IStrategoTerm m_4782 = null;
      IStrategoTerm q_4782 = null;
      q_4782 = term;
      IStrategoTerm term12424 = term;
      Success12347:
      { 
        Fail23101:
        { 
          m_4782 = term;
          if(true)
            break Success12347;
        }
        term = term12424;
        IStrategoTerm n_4782 = null;
        IStrategoTerm o_4782 = null;
        IStrategoTerm u_4782 = null;
        n_4782 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23100;
        o_4782 = term;
        u_4782 = n_4782;
        term = report_with_failure_0_2.instance.invoke(context, u_4782, trans.const4579, o_4782);
        if(term == null)
          break Fail23100;
      }
      term = q_4782;
      if(m_4782 == null)
        break Fail23100;
      term = m_4782;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}