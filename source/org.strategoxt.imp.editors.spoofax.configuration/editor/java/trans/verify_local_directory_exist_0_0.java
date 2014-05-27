package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class verify_local_directory_exist_0_0 extends Strategy 
{ 
  public static verify_local_directory_exist_0_0 instance = new verify_local_directory_exist_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("verify_local_directory_exist_0_0");
    Fail22803:
    { 
      IStrategoTerm s_4615 = null;
      IStrategoTerm t_4615 = null;
      s_4615 = term;
      Success12147:
      { 
        Fail22804:
        { 
          IStrategoTerm u_4615 = null;
          u_4615 = term;
          term = is_dir_exist_0_0.instance.invoke(context, s_4615);
          if(term == null)
            break Fail22804;
          term = u_4615;
          { 
            term = trans.constNil4;
            t_4615 = trans.constNil4;
            if(true)
              break Success12147;
          }
        }
        IStrategoTerm z_4615 = null;
        IStrategoTerm b_4616 = null;
        IStrategoTerm c_4616 = null;
        term = s_4615;
        IStrategoTerm term12157 = term;
        Success12148:
        { 
          Fail22805:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22805;
            if(true)
              break Success12148;
          }
          term = term12157;
          IStrategoTerm term12158 = term;
          Success12149:
          { 
            Fail22806:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22806;
              if(true)
                break Success12149;
            }
            term = term12158;
            IStrategoTerm term12159 = term;
            Success12150:
            { 
              Fail22807:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22807;
                if(true)
                  break Success12150;
              }
              term = term12159;
              IStrategoTerm term12160 = term;
              Success12151:
              { 
                Fail22808:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail22808;
                  if(true)
                    break Success12151;
                }
                term = term12160;
                IStrategoTerm v_4615 = null;
                IStrategoTerm w_4615 = null;
                IStrategoTerm y_4615 = null;
                v_4615 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail22803;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail22803;
                w_4615 = ((IStrategoList)term).tail();
                y_4615 = w_4615;
                term = report_failure_0_2.instance.invoke(context, y_4615, trans.const4471, v_4615);
                if(term == null)
                  break Fail22803;
              }
            }
          }
        }
        b_4616 = term;
        z_4615 = trans.const4457;
        c_4616 = b_4616;
        term = string_replace_0_2.instance.invoke(context, c_4616, z_4615, trans.const4472);
        if(term == null)
          break Fail22803;
        term = (IStrategoTerm)termFactory.makeListCons(trans.const4474, termFactory.makeListCons(term, (IStrategoList)trans.constCons2045));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22803;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(s_4615, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4))), (IStrategoList)trans.constNil4);
        t_4615 = term;
      }
      term = t_4615;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}