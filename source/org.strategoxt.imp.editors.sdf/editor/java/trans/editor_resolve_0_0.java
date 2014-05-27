package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class editor_resolve_0_0 extends Strategy 
{ 
  public static editor_resolve_0_0 instance = new editor_resolve_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("editor_resolve_0_0");
    Fail75910:
    { 
      IStrategoTerm term41706 = term;
      Success41630:
      { 
        Fail75911:
        { 
          IStrategoTerm t_92056 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
            break Fail75911;
          IStrategoTerm arg25995 = term.getSubterm(0);
          if(arg25995.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg25995).getConstructor())
            break Fail75911;
          t_92056 = arg25995.getSubterm(0);
          term = $Declaration_0_0.instance.invoke(context, t_92056);
          if(term == null)
            break Fail75911;
          if(true)
            break Success41630;
        }
        term = term41706;
        IStrategoTerm m_92056 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
          break Fail75910;
        IStrategoTerm arg25996 = term.getSubterm(0);
        if(arg25996.getTermType() != IStrategoTerm.APPL || Main._consunparameterized_1 != ((IStrategoAppl)arg25996).getConstructor())
          break Fail75910;
        m_92056 = arg25996.getSubterm(0);
        term = resolve_import_0_0.instance.invoke(context, m_92056);
        if(term == null)
          break Fail75910;
        term = parse_sdf_file_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail75910;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}