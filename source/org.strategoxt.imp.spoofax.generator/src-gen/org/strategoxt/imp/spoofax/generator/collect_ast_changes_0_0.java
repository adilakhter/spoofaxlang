package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class collect_ast_changes_0_0 extends Strategy 
{ 
  public static collect_ast_changes_0_0 instance = new collect_ast_changes_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("collect_ast_changes_0_0");
    Fail25878:
    { 
      TermReference s_4273 = new TermReference();
      IStrategoTerm t_4273 = null;
      IStrategoTerm u_4273 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25878;
      if(s_4273.value == null)
        s_4273.value = term.getSubterm(0);
      else
        if(s_4273.value != term.getSubterm(0) && !s_4273.value.match(term.getSubterm(0)))
          break Fail25878;
      t_4273 = term.getSubterm(1);
      IStrategoTerm term10304 = term;
      Success10237:
      { 
        Fail25879:
        { 
          IStrategoTerm v_4273 = null;
          v_4273 = term;
          if(s_4273.value == null)
            break Fail25879;
          term = termFactory.makeTuple(s_4273.value, t_4273);
          term = eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25879;
          term = v_4273;
          { 
            term = generator.constNil7;
            u_4273 = generator.constNil7;
            if(true)
              break Success10237;
          }
        }
        term = term10304;
        IStrategoTerm term10305 = term;
        Success10238:
        { 
          Fail25880:
          { 
            IStrategoTerm w_4273 = null;
            w_4273 = term;
            if(s_4273.value == null)
              break Fail25880;
            term = termFactory.makeTuple(s_4273.value, t_4273);
            IStrategoTerm term10306 = term;
            Success10239:
            { 
              Fail25881:
              { 
                term = same_signature_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25881;
                if(true)
                  break Success10239;
              }
              term = unmodified_list_0_0.instance.invoke(context, term10306);
              if(term == null)
                break Fail25880;
            }
            term = w_4273;
            { 
              IStrategoTerm z_4273 = null;
              if(s_4273.value == null)
                break Fail25878;
              term = get_arguments_0_0.instance.invoke(context, s_4273.value);
              if(term == null)
                break Fail25878;
              z_4273 = term;
              term = get_arguments_0_0.instance.invoke(context, t_4273);
              if(term == null)
                break Fail25878;
              term = termFactory.makeTuple(z_4273, term);
              term = zip_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25878;
              lifted9289 lifted92890 = new lifted9289();
              lifted92890.s_4273 = s_4273;
              term = map_with_index_1_0.instance.invoke(context, term, lifted92890);
              if(term == null)
                break Fail25878;
              term = flatten_list_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25878;
              u_4273 = term;
              if(true)
                break Success10238;
            }
          }
          term = term10305;
          IStrategoTerm term10307 = term;
          Success10240:
          { 
            Fail25882:
            { 
              IStrategoTerm x_4273 = null;
              x_4273 = term;
              if(s_4273.value == null)
                break Fail25882;
              term = is_list_0_0.instance.invoke(context, s_4273.value);
              if(term == null)
                break Fail25882;
              term = is_list_0_0.instance.invoke(context, t_4273);
              if(term == null)
                break Fail25882;
              term = x_4273;
              { 
                if(s_4273.value == null)
                  break Fail25878;
                term = termFactory.makeTuple(s_4273.value, t_4273);
                term = collect_ast_changes_in_list_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25878;
                u_4273 = term;
                if(true)
                  break Success10240;
              }
            }
            term = term10307;
            if(s_4273.value == null)
              break Fail25878;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consREPLACEMENT_2, new IStrategoTerm[]{s_4273.value, t_4273}), (IStrategoList)generator.constNil7);
            u_4273 = term;
          }
        }
      }
      term = u_4273;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}